package initialPackages;

public class Box<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
	      Box<Integer> integerBox = new Box<Integer>();
	      Box<String> stringBox = new Box<String>();
	      Box<Double> doubleBox = new Box<Double>();
	    
	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));
	      doubleBox.add(9999.39);

	      System.out.printf("Integer Value :%d\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	      System.out.printf("Double Value :%s\n", doubleBox.get());
	   }
	}