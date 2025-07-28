
public class Avg_float
{
    public void main(float Fi, float se, float th, float fo, float fi)
    {
      float avg = (Fi+se+th+fo+fi)/5;
      
      if(avg>50)
      System.out.println(" GOOD ! ");
      else
      System.out.println(" BAD ! ");
    }
} 