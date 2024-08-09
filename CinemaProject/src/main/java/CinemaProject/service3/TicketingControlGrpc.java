package CinemaProject.service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: TicketingControl.proto")
public final class TicketingControlGrpc {

  private TicketingControlGrpc() {}

  public static final String SERVICE_NAME = "CinemaProject.TicketingControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CinemaProject.service3.PurchaseTicketRequest,
      CinemaProject.service3.PurchaseTicketResponse> getPurchaseTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseTicket",
      requestType = CinemaProject.service3.PurchaseTicketRequest.class,
      responseType = CinemaProject.service3.PurchaseTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service3.PurchaseTicketRequest,
      CinemaProject.service3.PurchaseTicketResponse> getPurchaseTicketMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service3.PurchaseTicketRequest, CinemaProject.service3.PurchaseTicketResponse> getPurchaseTicketMethod;
    if ((getPurchaseTicketMethod = TicketingControlGrpc.getPurchaseTicketMethod) == null) {
      synchronized (TicketingControlGrpc.class) {
        if ((getPurchaseTicketMethod = TicketingControlGrpc.getPurchaseTicketMethod) == null) {
          TicketingControlGrpc.getPurchaseTicketMethod = getPurchaseTicketMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service3.PurchaseTicketRequest, CinemaProject.service3.PurchaseTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.TicketingControl", "PurchaseTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.PurchaseTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.PurchaseTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketingControlMethodDescriptorSupplier("PurchaseTicket"))
                  .build();
          }
        }
     }
     return getPurchaseTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service3.ReserveSeatRequest,
      CinemaProject.service3.ReserveSeatResponse> getReserveSeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveSeat",
      requestType = CinemaProject.service3.ReserveSeatRequest.class,
      responseType = CinemaProject.service3.ReserveSeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service3.ReserveSeatRequest,
      CinemaProject.service3.ReserveSeatResponse> getReserveSeatMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service3.ReserveSeatRequest, CinemaProject.service3.ReserveSeatResponse> getReserveSeatMethod;
    if ((getReserveSeatMethod = TicketingControlGrpc.getReserveSeatMethod) == null) {
      synchronized (TicketingControlGrpc.class) {
        if ((getReserveSeatMethod = TicketingControlGrpc.getReserveSeatMethod) == null) {
          TicketingControlGrpc.getReserveSeatMethod = getReserveSeatMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service3.ReserveSeatRequest, CinemaProject.service3.ReserveSeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.TicketingControl", "ReserveSeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.ReserveSeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.ReserveSeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketingControlMethodDescriptorSupplier("ReserveSeat"))
                  .build();
          }
        }
     }
     return getReserveSeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CinemaProject.service3.GetMovieScheduleRequest,
      CinemaProject.service3.GetMovieScheduleResponse> getGetMovieScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovieSchedule",
      requestType = CinemaProject.service3.GetMovieScheduleRequest.class,
      responseType = CinemaProject.service3.GetMovieScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CinemaProject.service3.GetMovieScheduleRequest,
      CinemaProject.service3.GetMovieScheduleResponse> getGetMovieScheduleMethod() {
    io.grpc.MethodDescriptor<CinemaProject.service3.GetMovieScheduleRequest, CinemaProject.service3.GetMovieScheduleResponse> getGetMovieScheduleMethod;
    if ((getGetMovieScheduleMethod = TicketingControlGrpc.getGetMovieScheduleMethod) == null) {
      synchronized (TicketingControlGrpc.class) {
        if ((getGetMovieScheduleMethod = TicketingControlGrpc.getGetMovieScheduleMethod) == null) {
          TicketingControlGrpc.getGetMovieScheduleMethod = getGetMovieScheduleMethod = 
              io.grpc.MethodDescriptor.<CinemaProject.service3.GetMovieScheduleRequest, CinemaProject.service3.GetMovieScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaProject.TicketingControl", "GetMovieSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.GetMovieScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CinemaProject.service3.GetMovieScheduleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketingControlMethodDescriptorSupplier("GetMovieSchedule"))
                  .build();
          }
        }
     }
     return getGetMovieScheduleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketingControlStub newStub(io.grpc.Channel channel) {
    return new TicketingControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketingControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TicketingControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketingControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TicketingControlFutureStub(channel);
  }

  /**
   */
  public static abstract class TicketingControlImplBase implements io.grpc.BindableService {

    /**
     */
    public void purchaseTicket(CinemaProject.service3.PurchaseTicketRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.PurchaseTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPurchaseTicketMethod(), responseObserver);
    }

    /**
     */
    public void reserveSeat(CinemaProject.service3.ReserveSeatRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.ReserveSeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReserveSeatMethod(), responseObserver);
    }

    /**
     */
    public void getMovieSchedule(CinemaProject.service3.GetMovieScheduleRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.GetMovieScheduleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMovieScheduleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPurchaseTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service3.PurchaseTicketRequest,
                CinemaProject.service3.PurchaseTicketResponse>(
                  this, METHODID_PURCHASE_TICKET)))
          .addMethod(
            getReserveSeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service3.ReserveSeatRequest,
                CinemaProject.service3.ReserveSeatResponse>(
                  this, METHODID_RESERVE_SEAT)))
          .addMethod(
            getGetMovieScheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CinemaProject.service3.GetMovieScheduleRequest,
                CinemaProject.service3.GetMovieScheduleResponse>(
                  this, METHODID_GET_MOVIE_SCHEDULE)))
          .build();
    }
  }

  /**
   */
  public static final class TicketingControlStub extends io.grpc.stub.AbstractStub<TicketingControlStub> {
    private TicketingControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketingControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketingControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketingControlStub(channel, callOptions);
    }

    /**
     */
    public void purchaseTicket(CinemaProject.service3.PurchaseTicketRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.PurchaseTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurchaseTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reserveSeat(CinemaProject.service3.ReserveSeatRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.ReserveSeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReserveSeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovieSchedule(CinemaProject.service3.GetMovieScheduleRequest request,
        io.grpc.stub.StreamObserver<CinemaProject.service3.GetMovieScheduleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMovieScheduleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketingControlBlockingStub extends io.grpc.stub.AbstractStub<TicketingControlBlockingStub> {
    private TicketingControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketingControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketingControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketingControlBlockingStub(channel, callOptions);
    }

    /**
     */
    public CinemaProject.service3.PurchaseTicketResponse purchaseTicket(CinemaProject.service3.PurchaseTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getPurchaseTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service3.ReserveSeatResponse reserveSeat(CinemaProject.service3.ReserveSeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getReserveSeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public CinemaProject.service3.GetMovieScheduleResponse getMovieSchedule(CinemaProject.service3.GetMovieScheduleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMovieScheduleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketingControlFutureStub extends io.grpc.stub.AbstractStub<TicketingControlFutureStub> {
    private TicketingControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketingControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketingControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketingControlFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service3.PurchaseTicketResponse> purchaseTicket(
        CinemaProject.service3.PurchaseTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPurchaseTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service3.ReserveSeatResponse> reserveSeat(
        CinemaProject.service3.ReserveSeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReserveSeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CinemaProject.service3.GetMovieScheduleResponse> getMovieSchedule(
        CinemaProject.service3.GetMovieScheduleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMovieScheduleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PURCHASE_TICKET = 0;
  private static final int METHODID_RESERVE_SEAT = 1;
  private static final int METHODID_GET_MOVIE_SCHEDULE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketingControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketingControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PURCHASE_TICKET:
          serviceImpl.purchaseTicket((CinemaProject.service3.PurchaseTicketRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service3.PurchaseTicketResponse>) responseObserver);
          break;
        case METHODID_RESERVE_SEAT:
          serviceImpl.reserveSeat((CinemaProject.service3.ReserveSeatRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service3.ReserveSeatResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIE_SCHEDULE:
          serviceImpl.getMovieSchedule((CinemaProject.service3.GetMovieScheduleRequest) request,
              (io.grpc.stub.StreamObserver<CinemaProject.service3.GetMovieScheduleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TicketingControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketingControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CinemaProject.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketingControl");
    }
  }

  private static final class TicketingControlFileDescriptorSupplier
      extends TicketingControlBaseDescriptorSupplier {
    TicketingControlFileDescriptorSupplier() {}
  }

  private static final class TicketingControlMethodDescriptorSupplier
      extends TicketingControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketingControlMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TicketingControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketingControlFileDescriptorSupplier())
              .addMethod(getPurchaseTicketMethod())
              .addMethod(getReserveSeatMethod())
              .addMethod(getGetMovieScheduleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
