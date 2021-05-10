public class Client {
    public static void main(String args[])
{Leader objDirector,objManager,objGeneralManager;

    objDirector = new Director("老王");
    objManager = new Manager("老赵");
    objGeneralManager = new GeneralManager("老李");

    objDirector.setSuccessor(objManager);
    objManager.setSuccessor(objGeneralManager);
    objGeneralManager.setSuccessor(objDirector);
    LeaveRequest lr1 = new LeaveRequest("小张",2);
    objDirector.handleRequest(lr1);

    LeaveRequest lr2 = new LeaveRequest("小李",5);
    objDirector.handleRequest(lr2);

    LeaveRequest lr3 = new LeaveRequest("小王",15);
    objDirector.handleRequest(lr3);

    LeaveRequest lr4 = new LeaveRequest("小赵",45);
    objDirector.handleRequest(lr4);

}
}
