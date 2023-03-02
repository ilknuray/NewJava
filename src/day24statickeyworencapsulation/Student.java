package day24statickeyworencapsulation;
/*encapsulation:"Data hiding" yani data gizlemektir
   =>Data yi neden gizlersiniz
   *dis etkenlerden korumak icin gizlerim

   =>Nasi gizlersin
   *access modifieri private yaparak

   =>datayi gizledikten sonra baska classlardan okumak istedigimde ne yaparim
   *Kapsulleme sonrasi bazi ozel methodlarla ulasabilirim
   "get"methodlar olusturarak gizlenmis datalari okuyabilirim(getter)

   =>Datayi gizledikten sonra baska classlardan degistirmek istersem ne yaparim
   *"set" methodlar olusturarakgizledigimiz data yi degistirebiliriz(setter)
    */
//variable in data type ile get methodunun in return type ayni olmalidir
//get methodlari isimlendirirken get+variable name koyariz ancak variable in data type i boolean ise is+datatype yapariz
public class Student {

   public String sdtName="Tom Hanks";//Her data nin gizlenmesine gerek yoktur
   private String id="ertyukjh";
   private double gpa=.8;
   private boolean retired=false;


   public String getId() {
      return id;
   }

   public double getGpa() {
      return gpa;
   }

   public boolean isRetired() {
      return retired;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setGpa(double gpa) {
      this.gpa = gpa;
   }

   public void setRetired(boolean retired) {
      this.retired = retired;
   }
}
