<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.SignMessageRequest</code>
 */
class SignMessageRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes message = 1;</code>
     */
    protected $message = '';
    /**
     * Generated from protobuf field <code>string key_id = 2;</code>
     */
    protected $key_id = '';
    /**
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     */
    protected $signing_context = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $message
     *     @type string $key_id
     *     @type \Catalyst\Protocol\Cryptography\SigningContext $signing_context
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes message = 1;</code>
     * @return string
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Generated from protobuf field <code>bytes message = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setMessage($var)
    {
        GPBUtil::checkString($var, False);
        $this->message = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string key_id = 2;</code>
     * @return string
     */
    public function getKeyId()
    {
        return $this->key_id;
    }

    /**
     * Generated from protobuf field <code>string key_id = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setKeyId($var)
    {
        GPBUtil::checkString($var, True);
        $this->key_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     * @return \Catalyst\Protocol\Cryptography\SigningContext
     */
    public function getSigningContext()
    {
        return $this->signing_context;
    }

    /**
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     * @param \Catalyst\Protocol\Cryptography\SigningContext $var
     * @return $this
     */
    public function setSigningContext($var)
    {
        GPBUtil::checkMessage($var, \Catalyst\Protocol\Cryptography\SigningContext::class);
        $this->signing_context = $var;

        return $this;
    }

}

