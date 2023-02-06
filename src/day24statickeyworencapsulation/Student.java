package day24statickeyworencapsulation;
/*encapsulation:"Data hiding" yani data gizlemektir
   =>Data yi neden gizlersiniz
   *dis etkenlerden korumak icin gizlerim

   =>Nasi gizlersin
   *access modifieri private yaparak

   =>adatayi gizledikten sonra baska classlardan okumak istedigimde ne yaparim
   *Kapsulleme sonrasi bazi ozel methodlarla ulasabilirim
   "get"methodlar olusturarak gizlenmis datalari okuyabilirim(getter)

   =>Datayi gizledikten sonra baska classlardan degistirmek istersem ne yaparim
   *"set" methodlar olusturarakgizledigimiz data yi degistirebiliriz(setter)
    */
public class Student {

   private String sdtName="Tom Hanks";
   private String id="ertyukjh";
   private double gpa=.8;
   private boolean retired=false;

}
