package com.yy.pattern.memento.black_box;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.memento.black_box
 * @Author: YY
 * @CreateTime: 2024-10-10  11:52
 * @Description: Client
 * 备忘录模式 黑箱备忘录
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------大战Boss前------------");
        //大战Boss前
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        //保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("------------大战Boss后------------");
        //大战Boss时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复之前状态------------");
        //恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
