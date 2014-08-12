/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.socksx.v4;

import io.netty.handler.codec.socksx.SocksMessage;
import io.netty.handler.codec.socksx.SocksMessageType;
import io.netty.handler.codec.socksx.SocksProtocolVersion;
import io.netty.handler.codec.socksx.SocksResponse;
import io.netty.handler.codec.socksx.v5.SocksV5ResponseType;

/**
 * An abstract class that defines a SocksResponse, providing common properties for
 * {@link SocksV4CmdResponse}.
 *
 * @see SocksV4CmdResponse
 * @see UnknownSocksV4Response
 */
public abstract class SocksV4Response extends SocksResponse {

    protected SocksV4Response() {
        super(SocksProtocolVersion.SOCKS4a);
    }
}