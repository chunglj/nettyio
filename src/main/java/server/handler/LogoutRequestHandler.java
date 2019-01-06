package server.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;
import protoctol.response.LogoutResponsePacket;
import utils.SessionUtil;

public class LogoutRequestHandler extends SimpleChannelInboundHandler<LogoutRequestHandler> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutRequestHandler msg) throws Exception {
        SessionUtil.unBindSession(ctx.channel());
        LogoutResponsePacket logoutResponsePacket = new LogoutResponsePacket();
        logoutResponsePacket.setSuccess(true);
        ctx.channel().writeAndFlush(logoutResponsePacket);
    }
}
