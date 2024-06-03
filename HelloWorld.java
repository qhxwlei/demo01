public class HelloWorld{

	public static void main(String[] args){

		System.out.println("Hello World!");

		// 下面一行输出语句是在 hot-fix 分支上新增的
		System.out.println("hot-fix:content");
		
		// 下面一行输出语句是在 master 主分支上新增的
		System.out.println("master:content");

		// 下面一行输出语句是在 hot-fix 分支上又新增的
		System.out.println("hot-fix:content2");

  	}

}
