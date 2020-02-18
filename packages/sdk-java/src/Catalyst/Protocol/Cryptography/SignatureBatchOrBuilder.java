// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cryptography.proto

package Catalyst.Protocol.Cryptography;

public interface SignatureBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Cryptography.SignatureBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes signatures = 1;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getSignaturesList();
  /**
   * <code>repeated bytes signatures = 1;</code>
   */
  int getSignaturesCount();
  /**
   * <code>repeated bytes signatures = 1;</code>
   */
  com.google.protobuf.ByteString getSignatures(int index);

  /**
   * <code>repeated bytes public_keys = 2;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getPublicKeysList();
  /**
   * <code>repeated bytes public_keys = 2;</code>
   */
  int getPublicKeysCount();
  /**
   * <code>repeated bytes public_keys = 2;</code>
   */
  com.google.protobuf.ByteString getPublicKeys(int index);

  /**
   * <code>repeated bytes messages = 3;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getMessagesList();
  /**
   * <code>repeated bytes messages = 3;</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated bytes messages = 3;</code>
   */
  com.google.protobuf.ByteString getMessages(int index);

  /**
   * <code>bytes context = 4;</code>
   */
  com.google.protobuf.ByteString getContext();
}
