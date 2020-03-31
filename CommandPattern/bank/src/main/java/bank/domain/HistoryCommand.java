package bank.domain;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryCommand {
    private ArrayList<IBankCommands> commandList = new ArrayList<IBankCommands>();
    private ArrayList<IBankCommands> undoList = new ArrayList<IBankCommands>();

    public void undo(){
        if(commandList.size()>0){
            IBankCommands commandObject = commandList.get(commandList.size()-1);
            commandList.remove(commandObject);
            commandObject.unexecute();
            undoList.add(commandObject);
        }
    }

    public void redo(){
        if(undoList.size() >0){
            IBankCommands commandObject= undoList.get(undoList.size()-1);
            undoList.remove(commandObject);
            commandObject.execute();
            commandList.add(commandObject);
        }
    }
    public void addCommand(IBankCommands iBankCommands){
        commandList.add(iBankCommands);
    }
}
