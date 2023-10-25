
package org.example;
import java.util.ArrayList;
import java.util.List;
// Clasa Composite care poate conține alte componente
class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Desenez un grup de grafice:");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}


