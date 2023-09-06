package Class4;



class Queue{
		int front;
		int rear;
		int[] arr;
		
		Queue(){
			front = rear = -1;
			arr = new int[10];
		}
		
		void enqueue(int a) {
			if (rear == arr.length -1) {
				System.out.println("overflow alert");
			}else
				arr[++rear] = a;
			
			if(front == -1) {
				front++;
			}
		}

		int dequeue() {
			int x = -1;
			if (front == -1) {
				System.out.println("underflow");
			}else
				x= arr[front++];
			
			if (rear == 0) {
				rear--;
			}
				return x;
			}
			void display() {
				for(int i= front; i <= rear; i++)
					System.out.println(arr[i] + " ");
				
				System.out.println();
	     	}
		}
public class QueueDemo {

	public static void main(String[] args) {
		Queue ob = new Queue();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(7);
		ob.dequeue();
		ob.display();
	}
		
	}
