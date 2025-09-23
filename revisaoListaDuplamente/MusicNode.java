public class MusicNode{
   private String title;
   private MusicNode prev;
   private MusicNode next;
   
   public MusicNode(String title){
      this.title = title;
      this.prev = null;
      this.next = null;
   }
   
   public String getTitle(){
      return this.title;
   }
   
   public void setTitle(String title){
      this.title = title;
   }
   
   public MusicNode getPrev(){
      return this.prev;
   }
   
   public void setPrev(MusicNode prev){
      this.prev = prev;
   }
   
   public MusicNode getNext(){
      return this.next;
   }
   
   public void setNext(MusicNode next){
      this.next = next;
   }
}