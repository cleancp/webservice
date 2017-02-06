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
