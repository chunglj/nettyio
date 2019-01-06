package protoctol.request;

import protoctol.Packet;

import static protoctol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
