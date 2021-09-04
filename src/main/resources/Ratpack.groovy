import groovy.json.JsonOutput
import io.netty.handler.codec.http.cookie.DefaultCookie
import org.apache.commons.lang.RandomStringUtils
import org.apache.commons.lang.math.RandomUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ratpack.handling.RequestLogger
import ratpack.http.TypedData
import ratpack.ssl.SSLContexts

//import ratpack.pac4j.RatpackPac4j
//import org.pac4j.http.client.direct.DirectBasicAuthClient

import static ratpack.groovy.Groovy.ratpack

final Logger logger = LoggerFactory.getLogger(Ratpack.class)

ratpack {

//  serverConfig {
//    address(InetAddress.getByName('0.0.0.0'))
//    development(false)
//    ssl SSLContexts.sslContext(new File('keystore.jks'), 'password')
//  }

  handlers {

    all RequestLogger.ncsa(logger)

//    all RatpackPac4j.authenticator(new DirectBasicAuthClient())

    post('zoo-ws/animals') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "query=${request.query}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }

      if (request.query == '') {
        response.contentType('application/json')
        response.cookie('AWSELBID', 'baaadbeef6767676767690220').path = '/alpha'
        response.cookie('JSESSIONID', 'alphabeta120394049').httpOnly = true
        render JsonOutput.toJson([
          feedingLog: [],
          animalType: 'grizzly bear',
          name      : 'Bubbles'
        ])
      } else {
        response.status(500)
      }
    }

    get {
      response.contentType('application/json; charset=UTF-8')
      render(JsonOutput.toJson([
        valueA: 100,
        valueB: "AXB",
        valueC: '2000-01-02'
      ]))
    }

    get('activities') {
      response.contentType('application/json')
      response.status(404)
      render(JsonOutput.toJson([
        activities: [
          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": 100],
        ]
      ]))
    }

    post('api/application') {
      response.contentType('application/json')
      response.status(404)
      render(JsonOutput.toJson([
        timestamp: "2018-12-12T21:51:44.359+0000",
        status: 404,
        error: "Not Found",
        message: "No message available",
        path: "/api/application/"
      ]))
    }

    get('api/broker/add') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "query=${request.query}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }
      response.contentType('application/json')
      response.headers.add("Access-Control-Expose-Headers", "content-length,content-type")
        .add("X-XSS-Protection", "1; mode=block")
      render(JsonOutput.toJson([
        name: [
          first: "Donald",
          last: "duck"
        ]
      ]))
    }

    get('arrays') {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        "rawArray": [""],
        "rawArrayEqTo": [""],
        "regexpRawArray": [""]
      ]))
    }

    put('unfriendMe') {
      println "path=${request.path}"
      println "query=${request.query}"
      response.contentType('application/json')
      render JsonOutput.toJson("Ok")
    }

    post('query') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }

      response.contentType('application/json')
      render(JsonOutput.toJson([
        activities: [
//          [name: "Bob", "description": "Description of bob"],
          [name: "Fred", "description": 100],
        ]
      ]))
    }

    post('tasks/pactStateChange') {
      println "path=${request.path}"
      println "contentType=${request.contentType}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }

      response.contentType('application/json')
      render(JsonOutput.toJson([
        userId: 666
      ]))
    }

    get('article') {
      response.contentType('application/json')
      render(JsonOutput.toJson([
        articles: [
          [
            variants: [
              [
                100: [
                  [bundles: []]
                ]
              ]
            ]
          ],
          [
            variants: [
              [
                200: [
                  [bundles: []]
                ]
              ]
            ]
          ]
        ]
      ]))
    }

    get('some/url/client') {
      response.contentType('application/json; charset=UTF-8')
      response.status(400)
      response.headers.add('X-TEST', 'test')
      render('''[
        {
          "accessTokenValiditySeconds": 2047531805,
          "allowedScopes": [
                        100,
                        "HWQEabGJImGSEkp",
                        "LaIhYNueeqcDQfm",
                        "SCxIXIFATJEIvit",
                        "SSqGVJiwXycnHZO",
                        "iPpENLhFTbXGpTt",
                        "qmKXLMsEdaXdyvn",
                        "uJuBiZBGiToWRYK",
                        "xEtffZzKEQdXNBv",
                        "ySWoarvfBHBAOmA"
          ],

          "autoApprove": true,
          "clientSecret": "$2a$10$6W5venYTPJvN56SoCVISzOAS9NRgnvkQLWI6XKUTgpHD6Q75d9BRu",
          "contactEmail": "jsFDnxjMmKedPsM",
          "contactFirstName": "CnubJIiONQshfju",
          "contactLastName": "dSzktEWSSSCprRV",
          "description": "DDnerbtCJcXJdSJ",
          "grantTypes": [
                          "AZyZGSnloQEkXrZ",
                          "BNgxGvVgawObCVA",
                          "BjCRlTHkIrknhYY",
                          "LHMMMDnYcvuLBBr",
                          "OIrutyPdvoSFBEK",
                          "QvCZUUeKLSXfSwP",
                          "WtQmSJdnWutzEFu",
                          "tzKRkWouoUtnZYH",
                          "vYhaZOcFlrIscRU",
                          "wktIDvVUQJUehFR"
            ],
                  "id": "9daaad0a-8a2d-4e73-a963-fa1625cec110",
                  "name": "name",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
          "redirectUris": [
                          "JSdQvUdokPTlodl",
                          "JpEMvpcIWescPZR",
                          "VeqlKVXnbCPyjZK",
                          "ZgVqKaCOgYZtlZj",
                          "hMFJKfVwkgapsNe",
                          "hQxZXAecosoXsif",
                          "kFGJHlrcwnWORzL",
                          "nQdyNhxIKLmpZHk",
                          "oHUgeTNOYNQdkGo",
                          "wnrIZYwfVHPoLcU"
            ],
                  "refreshTokenValiditySeconds": 165274901,
          "secretRequired": true
                },
            {
                  "accessTokenValiditySeconds": 1725247274,
                  "allowedScopes": [
                        "DniUNWUNDSoDBmh",
                        "PCKoRyrTHZkdjjQ",
                        "TDGLJwfbUeziRgS",
                        "WLaCWUpQQjadDze",
                        "bIKJzzITpzkTKKe",
                        "kBnuzmYirIFSDHb",
                        "kllRvIwJInmGGDo",
                        "sAGFquVxtUfsHkv",
                        "vwHipQUTSpvwihE",
                        "wtOOOSLDvdPUbpe"
                      ],
                  "autoApprove": false,
                  "clientSecret": "$2a$10$JwbbZXMdlUcA1MLFuuVhIuGoNuWonOmBsS/rwU5MsehYhuYNATYlK",
                  "contactEmail": "LwjNwwogIBxMbSj",
                  "contactFirstName": "oZxnuPyIDpWMlif",
                  "contactLastName": "SeJEOGhoEjVaEuk",
                  "description": "neeqtcvQabZRfXP",
                  "grantTypes": [
                        "GcpIbfNNisoSNOz",
                        "JjPlzVVjfDyupEg",
                        "KWRiUwKAMugbfPu",
                        "KgcbziOdPPRStin",
                        "MgDYVCVVAVZjVCv",
                        "RgVWYlRkucVyeYj",
                        "WlPOmAIlNKbiLLh",
                        "ngKPorkQQeZCDCh",
                        "pXpajHeVaiBgnRy",
                        "vzEJhYIqrlaVCSQ"
                      ],
                  "id": "ec9aa5b3-ac7c-45b1-b953-cedb81e5edc1",
                  "name": "kttnlBIPLEnuBiZ",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [
                        "BaRiVtqyuNMZHPN",
                        "FwewjwPbonGsHGT",
                        "NuJLdsXCsPHpohJ",
                        "aNgUAnBjTypdOSR",
                        "eBbFcnqrkiOrmFS",
                        "eDuAcRFfkLHWLDQ",
                        "gCsvfvXcBMxmweb",
                        "iWNmdhYHPugfbuK",
                        "wNIkiYFWKrEAkWx",
                        "zzSSwkPFznXoTyS"
                      ],
                  "refreshTokenValiditySeconds": 1933494902,
                  "secretRequired": true
              },
            {
                  "accessTokenValiditySeconds": 0,
                  "allowedScopes": [
            
                      ],
                  "autoApprove": false,
                  "clientSecret": null,
                  "grantTypes": [
            
                      ],
                  "id": "29b16b57-8212-4aeb-a180-b021399c0012",
                  "privileges": [
            
                      ],
                  "redirectUris": [
            
                      ],
                  "refreshTokenValiditySeconds": 0,
                  "secretRequired": false
              },
            {
                  "accessTokenValiditySeconds": 600000,
                  "allowedScopes": [
                        "Authentication"
                      ],
                  "autoApprove": false,
                  "clientSecret": "$2a$10$tMneESmkGPUwIQlzN3C4J.wcKrSmIq2uzsy96iKrUSOt42zNUZmNi",
                  "grantTypes": [
                        "client_credentials",
                        "password"
                      ],
                  "id": "5139950a-ecc8-40e3-aa31-cf79fe1bb72a",
                  "name": "Bootstrapped IDM Super Admin Client",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [

                      ],
                  "refreshTokenValiditySeconds": 0,
                  "secretRequired": false
              },
            {
                  "accessTokenValiditySeconds": 1809947019,
                  "allowedScopes": [
                        "HTjyKASlWYCBEUL",
                        "LuRbWINFCYYfqmn",
                        "NISLZYXBQfuvomi",
                        "aYHzRfYrLXanoHS",
                        "evdIxHlemfODOKz",
                        "iyDRsGFHXDfFBAV",
                        "jFEaMGEnlgFXsoa",
                        "mRAAkSlNbWWTqsG",
                        "pDaAdfKPCVfbyaw",
                        "vrdvokfjVROZPan"
                      ],
                  "autoApprove": false,
                  "clientSecret": "$2a$10$b7MNfMwh0BGVubuKYlDbV.5oCqJoeQYG2hSo9C4DihXOeb4CXqrsG",
                  "contactEmail": "VaMZTtqRqBvOvBl",
                  "contactFirstName": "ffHtrxjHpzIAihS",
                  "contactLastName": "VcaCBwtCeZCfsxb",
                  "description": "KQlCEHKgKGObNhi",
                  "grantTypes": [
                        "GKZMjJbGxVvKdTf",
                        "HTBnDSaTnuDootw",
                        "IOgFyTrlNyQcYUa",
                        "SNqWULQeMVLrPjN",
                        "ZvEUOgyqMOeoSjW",
                        "bBzeQzHXRvcUBPu",
                        "bkCouMGlhCaDhgb",
                        "iwUvuqgFKLfcDVh",
                        "juyotxqlMIGwiys",
                        "sgyYQrnkPRVclVJ"
                      ],
                  "id": "abe5645a-b303-4dd7-bc4c-5a3599e4ce72",
                  "name": "uHZUxyJqDAyNptF",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [
                        "GoAuyKzABYDTUqg",
                        "HTwMUvPcQOYPkUT",
                        "MJHipgdmPTxfUuj",
                        "NLulSzXmjnCjifO",
                        "VSlGAUERZQztLyT",
                        "VwnhszQuaLEkQon",
                        "bQJsqttVsvaHrtX",
                        "cjMrHahYtcbTjkG",
                        "oTZYTlcMuFlAnjY",
                        "vnlzNRecpUiGAxX"
                      ],
                  "refreshTokenValiditySeconds": 1013769012,
                  "secretRequired": false
              },
            {
                  "accessTokenValiditySeconds": 2124378825,
                  "allowedScopes": [
                        "IYULWZOlSmyOuQO",
                        "JmpNgONMIZWZQLp",
                        "RmIgJyXmUUzIspF",
                        "bogyoaCJjLeRUtC",
                        "iPZCIbXkTgsRtes",
                        "kihJzBSfXirxlxq",
                        "pZuBJSjRtJYbVPX",
                        "qNFJwRqvzogwQjb",
                        "rXSYjJOocszzdTJ",
                        "sUGVsVEAJADDenq"
                      ],
                  "autoApprove": false,
                  "clientSecret": "$2a$10$b7UeYkUlzJtMQolYT0EfUuFvc0oxkWDIZK47WgIZl5WIs0fHe06jW",
                  "contactEmail": "zfKuMYNkolWqAPK",
                  "contactFirstName": "lgNQHrcREakjEDA",
                  "contactLastName": "DILHlcDnOYXAxVh",
                  "description": "fXFARwCruCXTNuE",
                  "grantTypes": [
                        "IUnJVmlnTYKcaJS",
                        "SvKDbcqJkhyIhVX",
                        "WDmeMkrVLQVxoUU",
                        "apelxyjDDWXuCag",
                        "dXivSOKqrFpaNAT",
                        "mSJhWHXtVTkgqZS",
                        "oQGyIGTwqCuirCf",
                        "uTFTiJoIkarfpSA",
                        "wQLNARxYjZmKDvE",
                        "wuVbAPumkrvOlRv"
                      ],
                  "id": "00000000-0000-0000-0000-000000000000",
                  "name": "EAtjINlTAReePqR",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [
                        "BNsvZRCMNyrtJaD",
                        "FQXBHSNdEUimaNJ",
                        "GWsniUCqOoNSPhn",
                        "IbBIvORNmaAFOFT",
                        "VPLtuVKbdigjZfq",
                        "VUDiKjFEYBHhiqC",
                        "aCbOaeXgMEapzyi",
                        "cOAMxaavBWeBbvd",
                        "rCRustlayuLmXnf",
                        "zPtYmXtjrNdJoRw"
                      ],
                  "refreshTokenValiditySeconds": 419507870,
                  "secretRequired": true
              },
            {
                  "accessTokenValiditySeconds": 754238008,
                  "allowedScopes": [
                        "AGxOUOfBzAibEnX",
                        "DnXPgPkHcXDJSNx",
                        "GDebGtpNFedFMPm",
                        "KjpNccNvtfIRMqx",
                        "OrnXWhKCFwFDVCf",
                        "OtVrUtgbUMhnHQd",
                        "aErDlnPkIolnFvG",
                        "bwWHWGNsHlSZDrG",
                        "obStsABdnutCNuT",
                        "rVZzTsgYuSqsEym"
                      ],
                  "autoApprove": true,
                  "clientSecret": "$2a$10$m7Wy0xvy7Cw2uF28XcWUmOpFMp4iYFZTYQexd5r3FKTX2Vx8RaeGu",
                  "contactEmail": "WcYFsLhijGBPjQY",
                  "contactFirstName": "MCeAUJhvcnmEXko",
                  "contactLastName": "jALQvTAoYrFAvCI",
                  "description": "JSxfCILtMXellpE",
                  "grantTypes": [
                        "AUPLnUKJczywqLT",
                        "MvgXIcoULCbArnF",
                        "SUTZcNpCNUryhPk",
                        "SZzixGZwOOwsdEm",
                        "TUwlKSJzOQJjFtE",
                        "UBYbkDYVWUqXtgV",
                        "UMvtOwECDAtRaKe",
                        "bvVjUGMHZuOjFvH",
                        "lRpGIaMPiVPcQaX",
                        "skvQACLVEhUWetK"
                      ],
                  "id": "25eeb46b-0332-4954-923c-6cacfab61e5e",
                  "name": "cztobBVnSsdhUos",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [
                        "CoXWoFdJnvHsgEs",
                        "LMyTEdLbEJGQjtO",
                        "WRLrPPjoXxQhrnM",
                        "fITktVzrQkgdBPx",
                        "hgoSWAfeVATseYr",
                        "pOEcevjMzzmFmaD",
                        "qsCHHuCOZdZhkMh",
                        "uKlmmfIzLBTmbLl",
                        "wshXTzgJHAakLno",
                        "ztSBSqnMvszorzj"
                      ],
                  "refreshTokenValiditySeconds": 2122765226,
                  "secretRequired": false
              },
            {
                  "accessTokenValiditySeconds": 112231087,
                  "allowedScopes": [
                        "JGMMpPRhdYuWXWM",
                        "SqgATtdjuWzdIVM",
                        "WdmJIkwNtFkpvxv",
                        "cMKgMHLGHuqqebY",
                        "iivGvqdAzwWBFgG",
                        "lSYnBbQLOzEWUpj",
                        "pPYAdhBUCTjGQMH",
                        "psAmNOXdhwZxnJk",
                        "sfinhnHbsSGRFOZ",
                        "uHqjAJxKEWirNKZ"
                      ],
                  "autoApprove": false,
                  "clientSecret": "$2a$10$bVZCH/ltnO2yuJLOIJnxoOJtDIKg/mDPT1ntIfUiD.mD3tS8GD/9.",
                  "contactEmail": "BTzlOzxviOBjCVj",
                  "contactFirstName": "weBRrYFUYrqXvEv",
                  "contactLastName": "BEMvDYebZtccAUc",
                  "description": "zVRyZGuFIxnBgJx",
                  "grantTypes": [
                        "FKkchfLYgGfpchA",
                        "KAPCTXcUxFXwQOG",
                        "KecdGwJMtQHpKAo",
                        "PkyfhJsWTIThsiZ",
                        "ScNivDlmQzDFXvx",
                        "SckEYPiRzhuHeUo",
                        "WCpeXjwnikZYRow",
                        "ZzFcvrbMYryaIFn",
                        "tKIHJZtIJYZhgCt",
                        "thNSNRBUpckNMmn"
                      ],
                  "id": "4978ec48-abfb-47aa-854f-0e6410230c82",
                  "name": "VJUpcLuNAFKgchn",
                  "privileges": [
                        "CHECK_TOKEN",
                        "MANAGE_CLIENT",
                        "MANAGE_IDP",
                        "MANAGE_USER"
                      ],
                  "redirectUris": [
                        "DIpcrCYZDvdYePH",
                        "HkudJidqIdMkftV",
                        "ZlkEKMJRhgwvYdJ",
                        "acSmGqIydkSwxsO",
                        "gPZTJxjtKZsbqjR",
                        "geUrWuiXpMfamxo",
                        "rxrFHgktNHVaRsx",
                        "sKhhRKcdTqhOmiz",
                        "vVjkirLiAjfqAXj",
                        "wPvvwMlZjkExsZG"
                      ],
                  "refreshTokenValiditySeconds": 52955175,
                  "secretRequired": true
        }
      ]''')
    }

    get('nullfields') {
      response.contentType('application/json; charset=UTF-8')
      response.headers['HEADER-X'] = ['Y']
      response.status(201)
      render('''
        [
            {
                "doesNotExist": "Test",
                "documentId": 0,
                "documentCategoryId": 5,
                "documentCategoryCode": null,
                "contentLength": 0,
                "tags": null
            },
            {
                "doesNotExist": "Test",
                "documentId": 1,
                "documentCategoryId": 5,
                "documentCategoryCode": null,
                "contentLength": 0,
                "tags": null
            }
        ]
      ''')
    }

    get('dictionaryNestedArray') {
      response.contentType('application/json; charset=UTF-8')
      render(JsonOutput.toJson([
        newFeature: [:],
        events: [
          tant: [
            [ //note, this does NOT match the value given in the pact consumer test
              title: "ant",
              asdf: 1
            ]
          ],
          john: [
            [
              title: "john",
              date: "2017-04-08T22:33:31.000"
            ], [
              title: 100, //"johnny",
              date: "2017-04-09T22:33:31.000"
            ]
          ]
        ]
      ]))
    }

//    post('zoo-ws/animals') {
//      println "path=${request.path}"
//      println "query=${request.query}"
//      println "contentType=${request.contentType}"
//      println "headers:"
//      request.headers.names.each {
//        println "    $it=[${request.headers.get(it)}]"
//      }
//      request.getBody().then { TypedData data ->
//        println "body=[${data.text}]"
//      }
//      response.contentType('application/json')
//      render(JsonOutput.toJson([
//        a: 'Put this in the header, please!',
//        b: 2
//      ]))
//    }

    get('v1/monitoring/ping') {
      response.contentType('application/json; charset=utf-8')
      render(JsonOutput.toJson([:]))
    }

    get('donuts/byFloors') {
      response.contentType('application/json; charset=utf-8')
      render(JsonOutput.toJson([
        "7": [
          [
            "quantity"   : 8,
            "location"   : [
              "floor": 7,
              "room" : "south break room"
            ],
            "description": "Hostess Fruit Pies",
            "creator"    : "Loren",
            "id"         : 14
          ]
        ]
      ]))
    }

    get('donuts') {
      response.contentType('application/json')
      render('''[
        {
          "creator": "loren",
          "quantity": 5,
          "created": "2018-08-03T14:51:49.796",
          "description": "donuts",
          "location": {
          "floor": 6,
          "room": "south kitchen"
        },
          "id": 1,
          "lastModified": "2018-08-03T14:51:54.796"
        },
        {
          "creator": "loren",
          "quantity": 5,
          "created": "2018-08-03T14:51:49.796",
          "description": "donuts",
          "location": {
          "floor": 6,
          "room": "south kitchen"
        },
          "id": 1,
          "lastModified": "X2018-08-03T14:51:54.796"
        }
      ]''')
    }

    post('values') {
      println "path=${request.path}"
      println "query=${request.query}"
      println "contentType=${request.contentType}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }
      response.contentType('application/json')
      response.headers['LOCATION'] = ["http://server/users/666"]
      render(JsonOutput.toJson([
        userName: "Test",
        userId: 666
      ]))
    }

    post('provider') {
      response.cookie('someCookie', 'someValue')
      response.cookie('someOtherCookie', 'someValue')
      response.cookie('someThirdXCookie', 'someValue')
      response.send()
    }

    get('files') {
      response.contentType('application/json')
      def first = [
        "path": RandomStringUtils.randomAlphanumeric(100),
        "size": RandomUtils.nextInt(100),
        "name": RandomStringUtils.randomAlphanumeric(20),
        "record_size": RandomUtils.nextInt(10),
        "id": RandomStringUtils.randomAlphanumeric(20),
        "type": "EXAMPLE"
      ]
      def last = [
        "path": RandomStringUtils.randomAlphanumeric(100),
        "size": RandomUtils.nextInt(100),
        "name": RandomStringUtils.randomAlphanumeric(20),
        "record_size": RandomUtils.nextInt(10),
        "id": RandomStringUtils.randomAlphanumeric(20),
        "type": "EXAMPLE"
      ]
      def files = (1..198).collect {
        [
          "path": RandomStringUtils.randomAlphanumeric(100),
          "size": RandomUtils.nextInt(100),
          "name": RandomStringUtils.randomAlphanumeric(20),
          "record_size": RandomUtils.nextInt(10),
          "id": RandomStringUtils.randomAlphanumeric(20),
          "type": "TYPE_C"
        ]
      }
      render(JsonOutput.toJson([
        [
          files: ([first] + files + last).flatten()
        ]
      ]))
    }

    get('alligators/:name') { ctx ->
      response.contentType('application/json;charset=utf-8')
      render(JsonOutput.toJson([name: 'Mary']))
    }

    post('messages') {
      println "path=${request.path}"
      println "query=${request.query}"
      println "contentType=${request.contentType}"
      println "headers:"
      request.headers.names.each {
        println "    $it=[${request.headers.get(it)}]"
      }
      request.getBody().then { TypedData data ->
        println "body=[${data.text}]"
      }
      response.contentType('application/json;charset=utf-8')
      render(JsonOutput.toJson([a: '1234']))
    }

    get('data') { ctx ->
      println "path=${request.path}"
      response.contentType('application/json;charset=utf-8')
      render(JsonOutput.toJson(["foo": "bar"]))
    }
  }
}
