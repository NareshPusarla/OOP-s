public class LineComparisonEqual{
	public boolean isEqualto(int x1,int x2,int y1,int y2,int p1,int p2,int q1,int q2){
		double xylen = Math.sqrt((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1)));
                double pqlen = Math.sqrt((p2-p1)*(p2-p1)+((q2-q1)*(q2-q1)));
		if (xylen == pqlen)
			return true;
		return false;
}
}
