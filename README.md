# webservice
2016.10.20

jax-rs + spring + maven构建的webservice服务

自动拆装箱

拆箱优先

栈stack与堆heap

类变量static修饰 存在heap中 stack有引用变量

实例变量 即new出来的对象，存在heap中 ，物理地址， 栈中引用变量丢失 Person p =  new Person(); 与new Person();栈堆的问题

局部变量，在作用域范围内，引用有效，作用域外引用无效 ，并被销毁，此时heap中的对象并未被马上释放

==与equals的区别

基本数据类型==与equals是一样的比较数值

引用数据类型

==比较栈中地址值和数据值 equals比较数据值


System.out.println("One print");
		String i = "ABC";
		String a = new String("ABC");
		String b = "AB"+"C";
		String c = b+"C";
		System.out.println(a==b);
		
		int ii = 1;
		Integer II = new Integer(1);
		Integer II1 = new Integer(1);
		System.out.println(II==ii);
		System.out.println(II==II1);
		
		float ff = 0.15f;
		Float FF = new Float(0.15);
		Float FF1 = new Float(0.15);
		System.out.println(ff==FF);
		System.out.println(FF==FF1);
		
		double dd = 0.15;
		Double DD = new Double("0.15");
		Double DD1 = new Double("0.15");
		System.out.println(dd==DD);
		System.out.println(DD1==DD);
