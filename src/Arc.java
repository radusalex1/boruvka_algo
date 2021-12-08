import java.awt.*;

public class Arc
{
    private Point start;
    private Point end;
    private Node endNode;
    private Node startNode;
    private boolean Selected=false;

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean selected) {
        Selected = selected;
    }

    private int Cost;
    public int getCost() {return Cost;}
    public void setCost(int cost) {Cost = cost;}

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }
    public Node getStartNode() {
        return startNode;
    }
    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }
    public Node getEndNode() {
        return endNode;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(int x,int y) {
        this.start.x = x;
        this.start.y=y;
    }

    public void setEnd(int x,int y) {
        this.end.x = x;
        this.end.y=y;

    }

    public Arc(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Point getPointStart()
    {
        return start;
    }
    public Point getPointEnd()
    {
        return end;
    }

    public void drawArc(Graphics g,Node start,Node end)
    {
        if (start != null)
        {
            if(Selected)
            {
                g.setColor(new Color(0,255,0));
            }
            else
            {
                g.setColor(new Color(255,0,0));
            }
            g.drawLine(start.getMiddleX(), start.getMiddleY(), end.getMiddleX(), end.getMiddleY());
            g.setColor(java.awt.Color.black);
            g.drawString(((Integer)Cost).toString(),(end.getCoordX()+start.getCoordX())/2,(end.getCoordY()+start.getCoordY())/2);
        }
    }
}
