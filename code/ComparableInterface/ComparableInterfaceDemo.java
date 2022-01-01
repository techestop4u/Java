import java.util.*;

public class ComparableInterfaceDemo {
    
    public void compareLists(){
        Record r1 = new Record();
         Record r2 = new Record();
         
         r1.setId(1);
         r2.setId(2);
         
         Errors e1 = new Errors("e1");
         Errors e2 = new Errors("e2");
         List<Errors> el1 = new ArrayList<>();
         el1.add(e1);
         el1.add(e2);
         Errors e3 = new Errors("e2");
         Errors e4 = new Errors("e1");
         
         List<Errors> el2 = new ArrayList<>();
         el2.add(e3);
         el2.add(e4);
         
         System.out.println("List before sort: ");
         printList(el1);
         printList(el2);
         Collections.sort(el1);
        Collections.sort(el2);
        System.out.println("List after sort: ");
         printList(el1);
         printList(el2);
        boolean equalList = true;
        for(int i = 0; i < el1.size(); i++){
            if(! (el1.get(i).getErrorCode().equals(el2.get(i).getErrorCode()))){
                equalList = false;
                break;
            }
        }
         
         System.out.println("List is equal? "+ equalList);
    }
    
    public void printList(List<Errors> e){
        e.forEach(errors -> {
            System.out.println(errors.errorCode);
            
        });
    }
    
    public static void main(String args[]) {
        ComparableInterfaceDemo c1 = new ComparableInterfaceDemo();
        c1.compareLists();
     
    }
    
    class Record{
        int id;
        List<Errors> errorList;
        
        public int getId(){
            return this.id;
        }
        
        public void setId(int i){
            this.id = i;
        }
        
        public List<Errors> getErrorList(){
            return this.errorList;
        }
        
        public void setErrorList(List<Errors> errorList){
            this.errorList = errorList;
        }
    }
    
    class Errors implements Comparable<Errors>{
        String errorCode;
        String errorDesription;
        
        Errors(String e){
            errorCode = e;
        }
        public String getErrorCode(){
            return this.errorCode;
        }
        
        public void setErrorCode(String ec){
            this.errorCode = ec;
        }
        
       
        public int compareTo(Errors e){
            String str1 = errorCode;
            System.out.println("str1: "+str1);
            String str2 = e.getErrorCode();
            int l1 = str1.length();
            int l2 = str2.length();
            int lmin = Math.min(l1, l2);
      
            for (int i = 0; i < lmin; i++) {
                int str1_ch = (int)str1.charAt(i);
                int str2_ch = (int)str2.charAt(i);
      
                if (str1_ch != str2_ch) {
                    return str1_ch - str2_ch;
                }
            }
            
            if (l1 != l2) {
                return l1 - l2;
            }
            else {
                return 0;
            }
            
        }
        
    }
}