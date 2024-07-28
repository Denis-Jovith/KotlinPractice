package aSoftAssignedTask

val css = """
    body.wh_bnts_frm_acdma_bdy {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        background-color: white;
    }
    
    .wh_bnfs_frm_acd_gn_list{
    margin-top:30px;
    }

    .container {
        display: flex;
        max-width: 1200px;
        margin: 20px;
        background-color:#ffffff;
        padding-right:40px;
    }

    .image_section {
        flex: 1;
        display: flex;
        justify-content: center;
        align-items: center;
        height:90vh;
        background-color:#ffffff;
        display:inline block;
        position:relative;
        
    }

    .content_section {
        flex: 2;
        padding: 20px;
        background-color: #fffff;
        border-radius: 8px;
        max-width: 580px;
        padding-left:40px;
        height:90vh;
        margin-top:52px;
    }

    h1 {
        font-size: 2em;
        color: #090909;
        margin-bottom: 10px;
        margin-left:-10px;
        font-family:sans-serif;
        font-weight:400px;
        
        
        
    }
    
    .Academia{
    margin-top:-8px;
    margin-left:-10px;
    font-family:sans-serif;
    }

    p {
        font-size: 1em;
        display:flex;
        color: #666666;
        margin-top:50px;
        margin-left:-10px;
    }

    ol {
        padding: 0;
        margin: 0;
        list-style: none;
    }
    .p1{
    margin-bottom:20px;
    }
    

    li.who_benefits_list {
        margin: 10px 0;
        padding: 10px 10px 10px 50px;
        background-color: #d6f2fe;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        display: flex;
        align-items: center;
        position: relative;
        font-size: 19px;
        width: 95%;
        font-size:0.75rem;    
    }
    

     li.who_benefits_list::before {
        content: counter(item);
        counter-increment: item;
//        font-weight: bold;
        color: #ffffff;
        background-color: #191917;
        border-radius: 43%;
        border-width: 5px;
        border-color: #ffffff; /* Set border color to white */
        width: 32px;
        height: 24px;
        display: inline-flex;
        justify-content: center;
        align-items: center;
        font-size: 13px;
        border: 5px solid #ffffff; /* Adjusted border width */
        position: absolute;
        top: 0px;
        left: -11px;
    }
    


    ol {
        counter-reset: item;
    }

    img {
        max-width: 500px;
        height: auto;
        border-radius: 8px;
        background-color:#ffffff;
        height:75vh;
        display:flex;
    }

    .category {
        color: #07141b;
        font-weight: bold;
        margin-right: 5px;
    }
    .schoolManaged {
        background-color: #ffffff;
        border-radius: 50px;
        border: 2px solid #ffffff;
        color: white;
        width: 200px;
        height: 9vh;
        position: relative;
        bottom:-21px;
        left:470px;
    }

    .shool_Managed_circle {
        background-color: #33c8f9;
        border-radius: 50%; /* Ensures the shape is a circle */
        border: 2px solid #35c5ff; /* Border color and width */
        color: #33c8f9;
        width: 50px; /* Width and height should be equal */
        height: 50px;
        display: flex; /* Center content if needed */
        align-items: center;
        justify-content: center;
        text-align: center; /* Center text inside the circle */
        font-size: 14px; /* Adjust font size if needed */
        position: absolute; /* Allows positioning relative to the parent */
        top: 50%; /* Center vertically */
        left: 10px; /* Adjust as needed to move almost to the leftmost side */
        transform: translateY(-50%); /* Offset the top position to truly center */
    }
    
    .schoolManaged h4 {
        color: black;
        font-weight: bold;
        margin-left: 70px; /* Adjust this value to position h4 to the right of the circle */
        position: absolute;
        top: 11%; /* Adjust this value to position h4 above h5 */
        transform: translateY(-50%);
    }
    
    .schoolManaged h5 {
        color: #c8bccc;
        margin-left: 70px; /* Adjust this value to position h5 to the right of the circle */
        position: absolute;
        top: 45%;
        transform: translateY(-50%);
    }
    
    
    
    
    
    
    .schoolManaged2 {
        background-color: #ffffff;
        border-radius: 50px;
        border: 2px solid #ffffff;
        color: white;
        width: 200px;
        height: 9vh;
        position: absolute;
        top:61%;
        left:221px;
    }

    .shool_Managed_circle2 {
        background-color: #33c8f9;
        border-radius: 50%; /* Ensures the shape is a circle */
        border: 2px solid #35c5ff; /* Border color and width */
        color: #33c8f9;
        width: 50px; /* Width and height should be equal */
        height: 50px;
        display: flex; /* Center content if needed */
        align-items: center;
        justify-content: center;
        text-align: center; /* Center text inside the circle */
        font-size: 14px; /* Adjust font size if needed */
        position: absolute; /* Allows positioning relative to the parent */
        top: 50%; /* Center vertically */
        left: 10px; /* Adjust as needed to move almost to the leftmost side */
        transform: translateY(-50%); /* Offset the top position to truly center */
    }
    
    .schoolManaged2 h4 {
        color: black;
        font-weight: bold;
        margin-left: 70px; /* Adjust this value to position h4 to the right of the circle */
        position: absolute;
        top: 11%; /* Adjust this value to position h4 above h5 */
        transform: translateY(-50%);
    }
    
    .schoolManaged2 h5 {
        color: #c8bccc;
        margin-left: 70px; /* Adjust this value to position h5 to the right of the circle */
        position: absolute;
        top: 45%;
        transform: translateY(-50%);
    }
    
    
    
    .bluetext1 {
        color: #29a9ff;
    }

    .bluetext2 {
        color: #189efd;
    }

    .bluetext3 {
        color: #2199f6;
    }

    .bluetext4 {
        color: #348dec;
    }

    .bluetext5 {
        color: #0782ff;
    }

    .bluetext6 {
        color: #1582e9;
    }

    .bluetext7 {
        color: #0771ff;
    }

    .bluetext8 {
        color: #065ffa;
    }

    .bluetext9 {
        color: #065ffa;
    }
    
    @media only screen and ()
""".trimIndent()
