package robotwars;

public class FighterRobot extends Robot{
    //constructor
    public FighterRobot(Room room)
    {
        super(room, 1, 4); //stamina=1   energyNeeded=4
      
    }
    
    public void act(Colony colony){
        
        Room tmpRoom = getRoom();
        
        while(tmpRoom != null)
        {
            if(tmpRoom.getSoldierList().size() >0)
            {
                tmpRoom.getSoldierList().get(0).reduceStamina(1);
                break;
            }
            //go to next room
            tmpRoom = tmpRoom.getExit();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int currentTunnelIndex = 0;
//        int currentRoomIndex = 0;
//        
//        
//        
//        
//        //find current room indexes
//        for(int i = 0; i < colony.getNumTunnels(); i++)
//        {
//            for(int j = 0; j < colony.getTunnelLength(i); j++)
//            {
//                tmpRoom = colony.getRoom(i, j);
//                
//                if(room == tmpRoom)
//                {
//                    currentTunnelIndex = i;
//                    currentRoomIndex = j;
//                    break;
//                }
//            }
//            
//            //makes code slightly faster
//            if(room == tmpRoom)
//            {
//                break;
//            }
//        }
//        
//        //scan tunnel backwards (starting from current room)
//        for(int j = currentRoomIndex; j < colony.getTunnelLength(currentTunnelIndex); j++)
//        {
//            tmpRoom = colony.getRoom(currentTunnelIndex, j);
//            if(tmpRoom.getSoldierList().size() > 0)
//            {
//                tmpRoom.getSoldierList().get(0).reduceStamina(1);
//                
//                //damages one soldier
//                break;
//            }
//        }
        
//        //hit soldier
//        int i,j;
//        for(i=0; i<colony.getNumTunnels(); i++){
//            j = colony.getTunnel(i).indexOf(getRoom());
//            if(j> -1){
//                break;
//            }
//        }
//        
//        int p = colony.getTunnel(i).indexOf(getRoom());
//        for(i=p; i<colony.getTunnelLength(i)-1; i++){
//            if(getRoom().getSoldiersNumber() != 0)
//            {
//                getRoom().getSoldierList().get(0).reduceStamina(1);
//                break;
//            }
//        }
//    
//        
//        if(getStamina()<=0){
//            leaveRoom();
//        }
    }
    
}
