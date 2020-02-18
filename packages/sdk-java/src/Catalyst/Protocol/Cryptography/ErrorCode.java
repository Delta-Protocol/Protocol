// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cryptography.proto

package Catalyst.Protocol.Cryptography;

/**
 * Protobuf enum {@code Catalyst.Protocol.Cryptography.ErrorCode}
 */
public enum ErrorCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown error.
   * </pre>
   *
   * <code>ERROR_CODE_UNKNOWN = 0;</code>
   */
  ERROR_CODE_UNKNOWN(0),
  /**
   * <pre>
   * Signature is of incorrect length or does not correspond to a valid point.
   * </pre>
   *
   * <code>INVALID_SIGNATURE = 1;</code>
   */
  INVALID_SIGNATURE(1),
  /**
   * <pre>
   * Public key is of incorrect length or cannot be decompressed to a valid point.
   * </pre>
   *
   * <code>INVALID_PUBLIC_KEY = 2;</code>
   */
  INVALID_PUBLIC_KEY(2),
  /**
   * <pre>
   * Private key is of incorrect length.
   * </pre>
   *
   * <code>INVALID_PRIVATE_KEY = 3;</code>
   */
  INVALID_PRIVATE_KEY(3),
  /**
   * <pre>
   * Signature cannot be verified against the provided information.
   * </pre>
   *
   * <code>SIGNATURE_VERIFICATION_FAILURE = 4;</code>
   */
  SIGNATURE_VERIFICATION_FAILURE(4),
  /**
   * <pre>
   * Context exceed the maximum allowed length.
   * </pre>
   *
   * <code>INVALID_CONTEXT_LENGTH = 5;</code>
   */
  INVALID_CONTEXT_LENGTH(5),
  /**
   * <pre>
   * Unable to convert message to valid data. 
   * </pre>
   *
   * <code>INVALID_BATCH_MESSAGE = 6;</code>
   */
  INVALID_BATCH_MESSAGE(6),
  /**
   * <pre>
   * Cannot perform batch verification as an unequal number of messages/signatures/keys were provided.
   * </pre>
   *
   * <code>ARRAYS_NOT_EQUAL_LENGTH = 7;</code>
   */
  ARRAYS_NOT_EQUAL_LENGTH(7),
  /**
   * <pre>
   * One or more signatures cannot be verified.
   * </pre>
   *
   * <code>BATCH_VERIFICATION_FAILURE = 8;</code>
   */
  BATCH_VERIFICATION_FAILURE(8),
  /**
   * <pre>
   * No error (just a teapot).
   * </pre>
   *
   * <code>NO_ERROR = 418;</code>
   */
  NO_ERROR(418),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown error.
   * </pre>
   *
   * <code>ERROR_CODE_UNKNOWN = 0;</code>
   */
  public static final int ERROR_CODE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Signature is of incorrect length or does not correspond to a valid point.
   * </pre>
   *
   * <code>INVALID_SIGNATURE = 1;</code>
   */
  public static final int INVALID_SIGNATURE_VALUE = 1;
  /**
   * <pre>
   * Public key is of incorrect length or cannot be decompressed to a valid point.
   * </pre>
   *
   * <code>INVALID_PUBLIC_KEY = 2;</code>
   */
  public static final int INVALID_PUBLIC_KEY_VALUE = 2;
  /**
   * <pre>
   * Private key is of incorrect length.
   * </pre>
   *
   * <code>INVALID_PRIVATE_KEY = 3;</code>
   */
  public static final int INVALID_PRIVATE_KEY_VALUE = 3;
  /**
   * <pre>
   * Signature cannot be verified against the provided information.
   * </pre>
   *
   * <code>SIGNATURE_VERIFICATION_FAILURE = 4;</code>
   */
  public static final int SIGNATURE_VERIFICATION_FAILURE_VALUE = 4;
  /**
   * <pre>
   * Context exceed the maximum allowed length.
   * </pre>
   *
   * <code>INVALID_CONTEXT_LENGTH = 5;</code>
   */
  public static final int INVALID_CONTEXT_LENGTH_VALUE = 5;
  /**
   * <pre>
   * Unable to convert message to valid data. 
   * </pre>
   *
   * <code>INVALID_BATCH_MESSAGE = 6;</code>
   */
  public static final int INVALID_BATCH_MESSAGE_VALUE = 6;
  /**
   * <pre>
   * Cannot perform batch verification as an unequal number of messages/signatures/keys were provided.
   * </pre>
   *
   * <code>ARRAYS_NOT_EQUAL_LENGTH = 7;</code>
   */
  public static final int ARRAYS_NOT_EQUAL_LENGTH_VALUE = 7;
  /**
   * <pre>
   * One or more signatures cannot be verified.
   * </pre>
   *
   * <code>BATCH_VERIFICATION_FAILURE = 8;</code>
   */
  public static final int BATCH_VERIFICATION_FAILURE_VALUE = 8;
  /**
   * <pre>
   * No error (just a teapot).
   * </pre>
   *
   * <code>NO_ERROR = 418;</code>
   */
  public static final int NO_ERROR_VALUE = 418;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ErrorCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorCode forNumber(int value) {
    switch (value) {
      case 0: return ERROR_CODE_UNKNOWN;
      case 1: return INVALID_SIGNATURE;
      case 2: return INVALID_PUBLIC_KEY;
      case 3: return INVALID_PRIVATE_KEY;
      case 4: return SIGNATURE_VERIFICATION_FAILURE;
      case 5: return INVALID_CONTEXT_LENGTH;
      case 6: return INVALID_BATCH_MESSAGE;
      case 7: return ARRAYS_NOT_EQUAL_LENGTH;
      case 8: return BATCH_VERIFICATION_FAILURE;
      case 418: return NO_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
          public ErrorCode findValueByNumber(int number) {
            return ErrorCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Catalyst.Protocol.Cryptography.Cryptography.getDescriptor().getEnumTypes().get(1);
  }

  private static final ErrorCode[] VALUES = values();

  public static ErrorCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Catalyst.Protocol.Cryptography.ErrorCode)
}
