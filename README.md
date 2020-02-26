### This is Rest API Test

## Requirements

- JDK 1.8
- Wildfly

## How To Start

1. Clone repository
2. go to TestRestAPI directory
3. Run Wildfly as standalone
4. Input command `mvn wildfly:deploy` to deploy
5. Go `http://localhost:8080/oam/api/mmc_packet_loss` for test (If you didn't change your config)
6. Go `http://localhost:8080/oam/api/mmc_packet_loss/123` for test (If you didn't change your config)  

