//package wekendHomework
//
//
//val cssa = """
//                        body {
//                                    font-family: Arial, sans-serif;
//                                    background-color: #f4f4f4;
//                                    margin: 0;
//                                    padding: 0;
//                                }
//                                .navbar {
//                                    background-color: #333;
//                                    overflow: hidden;
//                                }
//                                .navbar-list {
//                                    list-style-type: none;
//                                    margin: 0;
//                                    padding: 0;
//                                    display: flex;
//                                }
//                                .navbar-item {
//                                    flex: 1;
//                                    text-align: center;
//                                }
//                                .navbar-link {
//                                    display: block;
//                                    color: white;
//                                    text-align: center;
//                                    padding: 14px 16px;
//                                    text-decoration: none;
//                                }
//                                .navbar-link:hover {
//                                    background-color: #ddd;
//                                    color: black;
//                                }
//                                .content {
//                                    padding: 20px;
//                                }
//                                .header {
//                                    text-align: center;
//                                    padding: 50px;
//                                    background-color: lightblue;
//                                }
//                                .header h1 {
//                                    margin: 0;
//                                    font-size: 2.5em;
//                                }
//                                .service {
//                                    margin: 10px;
//                                    padding: 10px;
//                                    border: 1px solid #ccc;
//                                }
//                                .high-cost {
//                                    color: red;
//                                }
//                                .container {
//                                    display: inline-block;
//                                    background-color:alice;
//                                    alignment:center;
//                                }
//                                .footer {
//                                    background-color: #333;
//                                    overflow: hidden;
//                                    text-align: center;
//                                    color: white;
//                                    padding: 10px;
//                                    position: relative;
//                                    bottom: 0;
//                                    width: 100%;
//                                }
//""".trimIndent()


//
//package weekendHomework
//
//val cssa = """
//    body {
//        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
//        background-color: #f4f4f4;
//        margin: 0;
//        padding: 0;
//    }
//    .navbar {
//        background-color: #333;
//        overflow: hidden;
//        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
//    }
//    .navbar-list {
//        list-style-type: none;
//        margin: 0;
//        padding: 0;
//        display: flex;
//        justify-content: space-around;
//    }
//    .navbar-item {
//        flex: 1;
//        text-align: center;
//    }
//    .navbar-link {
//        display: block;
//        color: white;
//        text-align: center;
//        padding: 14px 16px;
//        text-decoration: none;
//        transition: background-color 0.3s, color 0.3s;
//    }
//    .navbar-link:hover {
//        background-color: #575757;
//        color: #fff;
//    }
//    .content {
//        padding: 20px;
//        max-width: 1200px;
//        margin: 0 auto;
//    }
//    .header {
//        text-align: center;
//        padding: 50px;
//        background: linear-gradient(to right, #00c6ff, #0072ff);
//        color: white;
//    }
//    .header h1 {
//        margin: 0;
//        font-size: 3em;
//        font-weight: bold;
//    }
//    .service {
//        margin: 10px;
//        padding: 20px;
//        border: 1px solid #ccc;
//        border-radius: 8px;
//        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
//        transition: transform 0.2s;
//        background-color: white;
//    }
//    .service:hover {
//        transform: scale(1.05);
//    }
//    .high-cost {
//        color: red;
//        font-weight: bold;
//    }
//    .container {
//        display: inline-block;
//        background-color: #e0f7fa;
//        text-align: center;
//        padding: 20px;
//        border-radius: 8px;
//        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
//        margin: 20px auto;
//        max-width: 600px;
//    }
//    .footer {
//        background-color: #333;
//        overflow: hidden;
//        text-align: center;
//        color: white;
//        padding: 10px;
//        position: relative;
//        bottom: 0;
//        width: 100%;
//        box-shadow: 0 -4px 8px rgba(0, 0, 0, 0.1);
//    }
//""".trimIndent()


package weekendHomework

val cssa = """
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }
    .navbar {
        background-color: #333;
        overflow: hidden;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    .navbar-list {
        list-style-type: none;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: space-around;
    }
    .navbar-item {
        flex: 1;
        text-align: center;
    }
    .navbar-link {
        display: block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        transition: background-color 0.3s, color 0.3s;
    }
    .navbar-link:hover {
        background-color: #575757;
        color: #fff;
    }
    .content {
        padding: 20px;
        max-width: 1200px;
        margin: 0 auto;
    }
    .header {
        text-align: center;
        padding: 50px;
        background: linear-gradient(to right, #00c6ff, #0072ff);
        color: white;
    }
    .header h1 {
        margin: 0;
        font-size: 3em;
        font-weight: bold;
    }
    .service {
        margin: 10px;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        transition: transform 0.5s;
        background-color: white;
    }
    .service:hover {
        transform: scale(1.05);
    }
    .high-cost {
        color: red;
        font-weight: bold;
    }
    .container {
        display: inline-block;
        background-color: #e0f7fa;
        text-align: center;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        margin: 20px auto;
        max-width: 600px;
    }
    .footer {
        background-color: #333;
        overflow: hidden;
        text-align: center;
        color: white;
        padding: 10px;
        position: relative;
        bottom: 0;
        width: 100%;
        box-shadow: 0 -4px 8px rgba(0, 0, 0, 0.1);
    }
""".trimIndent()
