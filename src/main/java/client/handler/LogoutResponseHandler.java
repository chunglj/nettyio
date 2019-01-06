package client.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;
import utils.SessionUtil;

public class LogoutResponseHandler extends SimpleChannelInboundHandler<LogoutResponseHandler> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutResponseHandler msg) throws Exception {
        SessionUtil.unBindSession(ctx.channel());
    }
}
