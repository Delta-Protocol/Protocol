<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Cryptography.proto

namespace Catalyst\Protocol\Cryptography;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Cryptography.Signature</code>
 */
class Signature extends \Google\Protobuf\Internal\Message
{
    /**
     * system domain context.
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 1;</code>
     */
    protected $signing_context = null;
    /**
     * signature digest.
     *
     * Generated from protobuf field <code>bytes raw_bytes = 2;</code>
     */
    protected $raw_bytes = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Catalyst\Protocol\Cryptography\SigningContext $signing_context
     *           system domain context.
     *     @type string $raw_bytes
     *           signature digest.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Cryptography::initOnce();
        parent::__construct($data);
    }

    /**
     * system domain context.
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 1;</code>
     * @return \Catalyst\Protocol\Cryptography\SigningContext
     */
    public function getSigningContext()
    {
        return $this->signing_context;
    }

    /**
     * system domain context.
     *
     * Generated from protobuf field <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 1;</code>
     * @param \Catalyst\Protocol\Cryptography\SigningContext $var
     * @return $this
     */
    public function setSigningContext($var)
    {
        GPBUtil::checkMessage($var, \Catalyst\Protocol\Cryptography\SigningContext::class);
        $this->signing_context = $var;

        return $this;
    }

    /**
     * signature digest.
     *
     * Generated from protobuf field <code>bytes raw_bytes = 2;</code>
     * @return string
     */
    public function getRawBytes()
    {
        return $this->raw_bytes;
    }

    /**
     * signature digest.
     *
     * Generated from protobuf field <code>bytes raw_bytes = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRawBytes($var)
    {
        GPBUtil::checkString($var, False);
        $this->raw_bytes = $var;

        return $this;
    }

}
