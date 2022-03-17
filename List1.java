

public class List1
{
    public Node head;// head
    public Node location;
    public Node predloc;
    
    void CreateList(){

        head= null;
    }
    
    void DestroyList(){
 

        head = null;
    }
    
    boolean Emptylist(){



        if(head==null) 
            return true;
        else
            return false;
    }

    void FindElement(int key) {

        location = head;
        predloc = null;
        while(location != null){
            if (location.no == key) break;
            else
                if(location.no > key) location = null;
                else {
                    predloc = location;
                    location = location.next;
                }
        }
    }
    

 void InsertElement(int key){  


        Node ptr;//temp
        FindElement(key);
        if(location != null) 
            System.out.println("This Element Is Found");
        else{
            ptr = new Node();
            ptr.no = key;
            
            System.out.println("Added Successfully!");
            if (predloc == null){
                ptr.next = head;
                head = ptr;
            }
            else{
                ptr.next = predloc.next;
                predloc.next = ptr;
            }
        }
    }
}  
