
public class StringRevArray {
	public static void show(String[]args){
	String StrRev=args[0];
StringBuilder sb=new  StringBuilder();
for(int i=0;i<=args.length;i++){
	sb.append(StrRev.charAt(args.length)-i-1);
}
System.out.println(sb);
}
}
