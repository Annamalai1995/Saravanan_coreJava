package OOPS;
class college
{
    public void courseofferd()
    {

        System.out.println("Engineering And Arts and science");
    }
}
class EStudents extends  college
{
    public void degree(){
    String cname="BE cse";
    System.out.println("SARAVANAN Degree:"+cname);

}


}
class AStudents extends EStudents
{
    public void Degree()
    {
        String cname="BTECh IT";
        System.out.println("Annamalai Degree:"+cname);
    }
}




public class Multilevel {
    public static void main(String[] args) {
        AStudents aa = new AStudents();
        aa.Degree();
        aa.degree();
        aa.courseofferd();
    }
}
