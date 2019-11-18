/*
 * Copyright (C) 2016-2019 Dennis Neufeld
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package space.npstr.wolfia.system.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.pubsub.StatefulRedisPubSubConnection;
import org.springframework.stereotype.Component;
import space.npstr.wolfia.config.properties.DatabaseConfig;

@Component
public class Redis {

    private final RedisClient client;
    private final StatefulRedisConnection<String, String> connection;
    private final StatefulRedisPubSubConnection<String, String> pubSub;

    public Redis(DatabaseConfig databaseConfig) {
        this.client = RedisClient.create(databaseConfig.getRedisUrl());
        this.connection = this.client.connect();
        this.pubSub = this.client.connectPubSub();
    }

    public StatefulRedisConnection<String, String> getConnection() {
        return this.connection;
    }

    public StatefulRedisPubSubConnection<String, String> getPubSub() {
        return this.pubSub;
    }

    public void shutdown() {
        this.connection.close();
        this.client.shutdown();
    }
}