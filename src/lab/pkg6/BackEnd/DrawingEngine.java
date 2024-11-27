/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6.BackEnd;

/**
 *
 * @author ahmadyasserhamad
 */
public interface DrawingEngine {
    //Manage shapes object
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    
    //Return created shapes objects
    public Shape[] getShapes();
    //Redraw all shapes on canvas 
    public void refresh(java.awt.Graphics canvas);
}
