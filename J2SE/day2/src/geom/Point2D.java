package geom;

public class Point2D
{
int x,y;
Point2D(int x,int y)
{
this.x=x;
this.y=y;
}
public String show()
{
return "the x and y coords are ("+x+","+y+")";
}

public  boolean isEqual(Point2D p)
{
if(p.x==p.y)
{
return true;
}
else
return false;
}
}


