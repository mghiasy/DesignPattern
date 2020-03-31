package counter;

import java.util.ArrayList;

public class HistoryCommand {
    private ArrayList<CounterCommands> commandList = new ArrayList<CounterCommands>();
    private ArrayList<CounterCommands> undoList = new ArrayList<CounterCommands>();

    public void undo(){
        if(commandList.size()>0){
            CounterCommands commandObject = commandList.get(commandList.size()-1);
            commandList.remove(commandObject);
            commandObject.unexecute();
            undoList.add(commandObject);
        }
    }

    public void redo(){
        if(undoList.size() >0){
            CounterCommands commandObject= undoList.get(undoList.size()-1);
            undoList.remove(commandObject);
            commandObject.execute();
            commandList.add(commandObject);
        }
    }
    public void addCommand(CounterCommands icounterCommand){
        commandList.add(icounterCommand);
    }
}
