//<Rectangle.java> -- Class Rectangle demonstrates ability to calculate area and perimeter of a given rectangle.
//CSIS 212-<D03>
//<Citations if necessary> -- None

package assignment_7_csis212;

/**
 *
 * @author Scott
 */
public class Rectangle {
    
    // Declare private variables
    private float length;
    private float width;

    
    // Default constructor
    // Creates a default instance of the class
    public Rectangle(){
        setLength(1);
        setWidth(1);
    }
    
    // Creates an new instance of the class using the supplied values
    public Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }
    
    // Verifies parameter value is valid and sets length of rectangle.
    public void setLength(float length){
        // Only allow between 0 and 20
        if (length > 0.0 && length < 20.0){
            this.length = length;            
        }                 
    }
    
    // Verifies parameter value is valid and sets width of rectangle.
    public void setWidth(float width){
        // Only allow between 0 and 20
        if (width > 0.0 && width < 20.0){
            this.width = width;            
        }                      
    }
    
    // Returns length of the rectangle.
    public float getLength(){        
        return this.length;
    }
    
    // Returns width of the rectangle.
    public float getWidth(){
        return this.width;                  
    }
    
    // Returns float value of the perimeter of the rectangle.
    public float Perimeter(){
        // Perimeter of rectangle = 2L+2W        
        return ((getLength() * 2) + (getWidth() * 2));
    }
    
    // Returns float value of the area of the rectangle.
    public float Area(){
        // Area of rectangle = L*W
        return (getLength() * getWidth());
    }
}
