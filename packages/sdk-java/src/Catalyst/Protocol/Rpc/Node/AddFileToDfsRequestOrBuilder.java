// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package Catalyst.Protocol.Rpc.Node;

public interface AddFileToDfsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Rpc.Node.AddFileToDfsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 file_size = 1;</code>
   * @return The fileSize.
   */
  long getFileSize();

  /**
   * <code>string file_name = 2;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 2;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string node = 3;</code>
   * @return The node.
   */
  java.lang.String getNode();
  /**
   * <code>string node = 3;</code>
   * @return The bytes for node.
   */
  com.google.protobuf.ByteString
      getNodeBytes();
}