public class MusicNode{
   private String name;
   private MusicNode next;
   
   public MusicNode(String name){
      this.name = name;
      this.next = null;
   }
   
   public String getName(){
      return this.name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public MusicNode getNext(){
      return this.next;
   }
   
   public void setNext(MusicNode next){
      this.next = next;
   }
}