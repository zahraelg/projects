

public class List2
{public Node head;// head
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
     void InsertElement(int key ){  


        Node ptr;//temp
        FindElement(key);
        if(location != null) 
            System.out.println("This Element Is Found");
        else{
            ptr = new Node();
            ptr.no = key;
            ptr.name = name;
            ptr.mark = mark;
            System.out.println("Added Successfully!");
            if (predloc == null){
                ptr.next = list;
                list = ptr;
            }
            else{
                ptr.next = predloc.next;
                predloc.next = ptr;
            }
        }
    }
    
    public  void removelist(List1)  {
        List2 l2=new List2();
          List3 l3=new List3();
     
       Node s=L1.head;
          Node s=L2.head;
       while(!List1.isempty()){
           if( s<0){
           L3 .insertNode( s.no);
           s= s.next;
           L1. DestroyList();}
           else{L2.insertNode(s.no);
               s=s.next;
          L1. DestroyList();
    }
}
}
   public void carstack(stack ,Stack1)
{    List2 l2=new List2();
    stack1 s=new stack1();
    stack1 s1=new stack1();
    while(l2!=isEmpty){s.push(l2.pup);}
    
    int val;//متغير تخزين مؤقت للstack
    while(!s.isEmpty()){s1.push(s.pop());}
    while(!s.isEmpty()){val=s1.pop();
    System.out.println(val);
    s.push(val);}
}
}
