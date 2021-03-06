# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Cryptography.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import Network_pb2 as Network__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='Cryptography.proto',
  package='Catalyst.Protocol.Cryptography',
  syntax='proto3',
  serialized_options=b'P\001',
  serialized_pb=b'\n\x12\x43ryptography.proto\x12\x1e\x43\x61talyst.Protocol.Cryptography\x1a\rNetwork.proto\"g\n\tSignature\x12G\n\x0fsigning_context\x18\x01 \x01(\x0b\x32..Catalyst.Protocol.Cryptography.SigningContext\x12\x11\n\traw_bytes\x18\x02 \x01(\x0c\"\x95\x01\n\x0eSigningContext\x12<\n\x0cnetwork_type\x18\x01 \x01(\x0e\x32&.Catalyst.Protocol.Network.NetworkType\x12\x45\n\x0esignature_type\x18\x02 \x01(\x0e\x32-.Catalyst.Protocol.Cryptography.SignatureType\"\\\n\x0eSignatureBatch\x12\x12\n\nsignatures\x18\x01 \x03(\x0c\x12\x13\n\x0bpublic_keys\x18\x02 \x03(\x0c\x12\x10\n\x08messages\x18\x03 \x03(\x0c\x12\x0f\n\x07\x63ontext\x18\x04 \x01(\x0c*\x98\x01\n\rSignatureType\x12\x1a\n\x16SIGNATURE_TYPE_UNKNOWN\x10\x00\x12\x16\n\x12TRANSACTION_PUBLIC\x10\x01\x12\x1c\n\x18TRANSACTION_CONFIDENTIAL\x10\x02\x12\x10\n\x0cPROTOCOL_RPC\x10\x03\x12\x11\n\rPROTOCOL_PEER\x10\x04\x12\x10\n\x0cWEB3_MESSAGE\x10\x05*\x92\x02\n\tErrorCode\x12\x16\n\x12\x45RROR_CODE_UNKNOWN\x10\x00\x12\x15\n\x11INVALID_SIGNATURE\x10\x01\x12\x16\n\x12INVALID_PUBLIC_KEY\x10\x02\x12\x17\n\x13INVALID_PRIVATE_KEY\x10\x03\x12\"\n\x1eSIGNATURE_VERIFICATION_FAILURE\x10\x04\x12\x1a\n\x16INVALID_CONTEXT_LENGTH\x10\x05\x12\x19\n\x15INVALID_BATCH_MESSAGE\x10\x06\x12\x1b\n\x17\x41RRAYS_NOT_EQUAL_LENGTH\x10\x07\x12\x1e\n\x1a\x42\x41TCH_VERIFICATION_FAILURE\x10\x08\x12\r\n\x08NO_ERROR\x10\xa2\x03\x42\x02P\x01\x62\x06proto3'
  ,
  dependencies=[Network__pb2.DESCRIPTOR,])

_SIGNATURETYPE = _descriptor.EnumDescriptor(
  name='SignatureType',
  full_name='Catalyst.Protocol.Cryptography.SignatureType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SIGNATURE_TYPE_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TRANSACTION_PUBLIC', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='TRANSACTION_CONFIDENTIAL', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PROTOCOL_RPC', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PROTOCOL_PEER', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='WEB3_MESSAGE', index=5, number=5,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=421,
  serialized_end=573,
)
_sym_db.RegisterEnumDescriptor(_SIGNATURETYPE)

SignatureType = enum_type_wrapper.EnumTypeWrapper(_SIGNATURETYPE)
_ERRORCODE = _descriptor.EnumDescriptor(
  name='ErrorCode',
  full_name='Catalyst.Protocol.Cryptography.ErrorCode',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ERROR_CODE_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_SIGNATURE', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PUBLIC_KEY', index=2, number=2,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PRIVATE_KEY', index=3, number=3,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='SIGNATURE_VERIFICATION_FAILURE', index=4, number=4,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CONTEXT_LENGTH', index=5, number=5,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='INVALID_BATCH_MESSAGE', index=6, number=6,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ARRAYS_NOT_EQUAL_LENGTH', index=7, number=7,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='BATCH_VERIFICATION_FAILURE', index=8, number=8,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='NO_ERROR', index=9, number=418,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=576,
  serialized_end=850,
)
_sym_db.RegisterEnumDescriptor(_ERRORCODE)

ErrorCode = enum_type_wrapper.EnumTypeWrapper(_ERRORCODE)
SIGNATURE_TYPE_UNKNOWN = 0
TRANSACTION_PUBLIC = 1
TRANSACTION_CONFIDENTIAL = 2
PROTOCOL_RPC = 3
PROTOCOL_PEER = 4
WEB3_MESSAGE = 5
ERROR_CODE_UNKNOWN = 0
INVALID_SIGNATURE = 1
INVALID_PUBLIC_KEY = 2
INVALID_PRIVATE_KEY = 3
SIGNATURE_VERIFICATION_FAILURE = 4
INVALID_CONTEXT_LENGTH = 5
INVALID_BATCH_MESSAGE = 6
ARRAYS_NOT_EQUAL_LENGTH = 7
BATCH_VERIFICATION_FAILURE = 8
NO_ERROR = 418



_SIGNATURE = _descriptor.Descriptor(
  name='Signature',
  full_name='Catalyst.Protocol.Cryptography.Signature',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='signing_context', full_name='Catalyst.Protocol.Cryptography.Signature.signing_context', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='raw_bytes', full_name='Catalyst.Protocol.Cryptography.Signature.raw_bytes', index=1,
      number=2, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=69,
  serialized_end=172,
)


_SIGNINGCONTEXT = _descriptor.Descriptor(
  name='SigningContext',
  full_name='Catalyst.Protocol.Cryptography.SigningContext',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='network_type', full_name='Catalyst.Protocol.Cryptography.SigningContext.network_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='signature_type', full_name='Catalyst.Protocol.Cryptography.SigningContext.signature_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=175,
  serialized_end=324,
)


_SIGNATUREBATCH = _descriptor.Descriptor(
  name='SignatureBatch',
  full_name='Catalyst.Protocol.Cryptography.SignatureBatch',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='signatures', full_name='Catalyst.Protocol.Cryptography.SignatureBatch.signatures', index=0,
      number=1, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='public_keys', full_name='Catalyst.Protocol.Cryptography.SignatureBatch.public_keys', index=1,
      number=2, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='messages', full_name='Catalyst.Protocol.Cryptography.SignatureBatch.messages', index=2,
      number=3, type=12, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='context', full_name='Catalyst.Protocol.Cryptography.SignatureBatch.context', index=3,
      number=4, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=326,
  serialized_end=418,
)

_SIGNATURE.fields_by_name['signing_context'].message_type = _SIGNINGCONTEXT
_SIGNINGCONTEXT.fields_by_name['network_type'].enum_type = Network__pb2._NETWORKTYPE
_SIGNINGCONTEXT.fields_by_name['signature_type'].enum_type = _SIGNATURETYPE
DESCRIPTOR.message_types_by_name['Signature'] = _SIGNATURE
DESCRIPTOR.message_types_by_name['SigningContext'] = _SIGNINGCONTEXT
DESCRIPTOR.message_types_by_name['SignatureBatch'] = _SIGNATUREBATCH
DESCRIPTOR.enum_types_by_name['SignatureType'] = _SIGNATURETYPE
DESCRIPTOR.enum_types_by_name['ErrorCode'] = _ERRORCODE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Signature = _reflection.GeneratedProtocolMessageType('Signature', (_message.Message,), {
  'DESCRIPTOR' : _SIGNATURE,
  '__module__' : 'Cryptography_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Cryptography.Signature)
  })
_sym_db.RegisterMessage(Signature)

SigningContext = _reflection.GeneratedProtocolMessageType('SigningContext', (_message.Message,), {
  'DESCRIPTOR' : _SIGNINGCONTEXT,
  '__module__' : 'Cryptography_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Cryptography.SigningContext)
  })
_sym_db.RegisterMessage(SigningContext)

SignatureBatch = _reflection.GeneratedProtocolMessageType('SignatureBatch', (_message.Message,), {
  'DESCRIPTOR' : _SIGNATUREBATCH,
  '__module__' : 'Cryptography_pb2'
  # @@protoc_insertion_point(class_scope:Catalyst.Protocol.Cryptography.SignatureBatch)
  })
_sym_db.RegisterMessage(SignatureBatch)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
