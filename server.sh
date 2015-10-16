#!/usr/bin/env bash
while true; do { echo -e 'HTTP/1.1 200\r\nDate: Fri, 24 Apr 2015 18:47:33 GMT\r\nContent-Type: application/json\r\nContent-Length: 126\r\n\r\n{"activities": [\n{\n"name": "bob",\n"description": "test description"\n},\n{\n"name": "fred",\n"description": "description!2"\n}\n]\n}'; } | nc -l -p 8084; done

