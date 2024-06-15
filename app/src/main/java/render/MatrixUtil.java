package render;

import org.joml.Matrix4f;

public class MatrixUtil {

    public static Matrix4f box(Matrix4f proj, float x, float y, float width, float height) {
        return new Matrix4f(proj).translate(x, y, 0).scale(width, height, 0);
    }
}
