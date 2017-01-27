package listasEnlazadas;

public class linkedList {
	 protected Nodo inicio ;
	    protected Nodo ultimo ;
	    public int tamanio ;
	 
	    // constructor 
	    public linkedList()
	    {
	        inicio = null;
	        ultimo = null;
	        tamanio = 0;
	    }
	    //Función para comprobar si la lista está vacía
	    public boolean listaEstaVacia()
	    {
	        return inicio == null;
	    }
	    
          //Función para obtener el tamaño de la lista
	    public int obtenerTamanio()
	    {
	        return tamanio;
	    }
	    // Función para insertar el elemento al principio
	    public void insertarAlInicio(int val)
	    {
	        Nodo nptr = new Nodo(val,null);    
	        nptr.setLink(inicio);
	        if(inicio == null)
	        {            
	            inicio = nptr;
	            nptr.setLink(inicio);
	            ultimo = inicio;            
	        }
	        else
	        {
	            ultimo.setLink(nptr);
	            inicio = nptr;        
	        }
	        tamanio++ ;
	    }
	    /* Function to insert element at end */
	    public void insertarAlFinal(int val)
	    {
	        Nodo nptr = new Nodo(val,null);    
	        nptr.setLink(inicio);
	        if(inicio == null)
	        {            
	            inicio = nptr;
	            nptr.setLink(inicio);
	            ultimo = inicio;            
	        }
	        else
	        {
	            ultimo.setLink(nptr);
	            ultimo = nptr;            
	        }
	        tamanio++ ;
	    }
	    /* Function to insert element at position */
	    public void insertarPorPosicion(int val , int pos) 
	    {
	        Nodo nptr = new Nodo(val,null);                
	        Nodo ptr = inicio;
	        pos = pos - 1 ;
	        for (int i = 1; i < tamanio - 1; i++) 
	        {
	            if (i == pos) 
	            {
	                Nodo tmp = ptr.getLink() ;
	                ptr.setLink( nptr );
	                nptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        tamanio++ ;
	    }
	    /* Function to delete element at position */
	    public void eliminarPorPosicion(int pos)
	    {    
	        if (tamanio == 1 && pos == 1)
	        {
	            inicio = null;
	            ultimo = null;
	            tamanio = 0;
	            return ;
	        }        
	        if (pos == 1) 
	        {
	            inicio = inicio.getLink();
	            ultimo.setLink(inicio);
	            tamanio--; 
	            return ;
	        }
	        if (pos == tamanio) 
	        {
	            Nodo s = inicio;
	            Nodo t = inicio;
	            while (s != ultimo)
	            {
	                t = s;
	                s = s.getLink();
	            }
	            ultimo = t;
	            ultimo.setLink(inicio);
	            tamanio --;
	            return;
	        }
	        Nodo ptr = inicio;
	        pos = pos - 1 ;
	        for (int i = 1; i < tamanio - 1; i++) 
	        {
	            if (i == pos) 
	            {
	                Nodo tmp = ptr.getLink();
	                tmp = tmp.getLink();
	                ptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        tamanio-- ;
	    }
	    /* Function to display contents */
	    public void display()
	    {
	        System.out.print("\nlista circular enlazada = ");
	        Nodo ptr = inicio;
	        if (tamanio == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (inicio.getLink() == inicio) 
	        {
	            System.out.print(inicio.getData()+ "->"+ptr.getData()+ "\n");
	            return;
	        }
	        System.out.print(inicio.getData()+ "->");
	        ptr = inicio.getLink();
	        while (ptr.getLink() != inicio) 
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "->");
	        ptr = ptr.getLink();
	        System.out.print(ptr.getData()+ "\n");
	    }

}
