class RunnableAttendance implements Runnable {
    private String studentName;

    public RunnableAttendance(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void run() {
        System.out.println("Student " + studentName + " is late.");
    }
}