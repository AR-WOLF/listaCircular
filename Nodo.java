package listasEnlazadas;

public class Nodo {
	protected int data;
    protected Nodo link;
 
    /*  Constructor  */
    public Nodo()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Nodo(int d,Nodo n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Nodo n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Nodo getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }

}
