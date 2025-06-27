import java.util.ArrayList;
import java.util.List;

public class MemoryDemo {
	static class HeapObject{
		int[] bigArray = new int[100000];
	}
	public static void stackVsHeapExample() {
		int stackVariable = 10;
		HeapObject obj = new HeapObject();
		System.out.println("Stack variable :" + stackVariable);
		System.out.println("Heap object created");
	}
	public static void garbageCollectionExample() {
		HeapObject obj1 = new HeapObject();
		HeapObject obj2 = new HeapObject();
		obj1 = null;
		System.gc();
		System.out.println("Requested garbage collection");
	}
	static List<Object> memoryLeakList = new ArrayList<>();
	public static void memoryLeakExample() {
		for(int i = 0; i < 100; i++) {
			memoryLeakList.add(new HeapObject());
		}
		System.out.println("Memory leak simulation done");
	}
	public static void main(String [] args) {
		System.out.println("====Stack vs Heap===");
		stackVsHeapExample();
		System.out.println("\n====Memory leak example===");
		memoryLeakExample();
		System.out.println("Program excuted");
		garbageCollectionExample();
		
	}
	protected void finalize() throws Throwable {
		System.out.println("finalize() called before object destroyed");
	}

}
