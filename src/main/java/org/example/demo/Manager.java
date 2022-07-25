package org.example.demo;



public class Manager extends Handler {
    //3-7天的假
    public Manager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "!");
        System.out.println("部门经理审批通过：同意！");
    }
}
