// stringBuffer reverse() method example

public class StringBufferReverseExample {

		public static void main(String args[]){
			
			String StringOrgin = new String("ShenZhen");
//			String t = s.toLowerCase();
			String StringChange = StringOrgin.toUpperCase();
			System.out.println(StringOrgin);	//StingOrgin not be changed
			System.out.println(StringChange);
			
//			StringBuffer buffer2 = "abc";	// Wrong ---- need to use the constructor 
			StringBuffer buffer = new StringBuffer("ShenZhen");
			buffer.append("Android");
			System.out.println(buffer.toString() + " is reverted to :" +  buffer.reverse());
			
			StringBuffer sb = new StringBuffer();
			String user = "abc";
			String passwd = "123";
			sb.append("Select * from userinfo where user name = ")
			.append(user)
			.append(" and passwd = ")
			.append(passwd);		//used for sql query info
			System.out.println(sb);
			
//			StringBuffer sbdelete = new StringBuffer("Shz");
			buffer.deleteCharAt(1);
			System.out.println(buffer);
			
			buffer.insert(1, "CHINA");
			System.out.println(buffer);
			
			
		}
}
