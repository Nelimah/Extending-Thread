class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running!");
    }
}
Thread t = new Thread(new MyRunnable());
t.start();
