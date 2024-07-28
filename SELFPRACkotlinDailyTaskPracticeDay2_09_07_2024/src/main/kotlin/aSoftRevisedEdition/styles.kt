package aSoftRevisedEdition

val css = """
      body {
}

.wh_bnts_frm_acdma_bdy {
}

.container {
    display: grid;
    grid-template-columns: 1fr 2fr;
}

.schoolManaged {
    background-color: #ffffff;
    border-radius: 3em;
    border: 0.2em solid #ffffff;
    text-align: center;
    width: 14em;
    height: 5em;
    position: relative;
    top: 59%;
    left: 52%;
    transform: translateX(3%);
    font-size: 1.08em;
    font-family: sans-serif;
}

.schoolManaged2 {
    position: relative;
    background-color: #ffffff;
    border: 0.2em solid #ffffff;
    border-radius: 4em;
    text-align: center;
    width: 14rem;
    height: 5em;
    top: 59%;
    left: 6%;
    transform: translateX(3%);
    font-size: 1.08em;
    font-family: sans-serif;
}

.shool_Managed_circle {
    position: absolute;
    background-color: #3bcaf6;
    width: 25%;
    height: 77%;
    top: 12%;
    left: 3%;
    border-radius: 50%;
}

.shool_Managed_circle2 {
    position: absolute;
    background-color: #0261ff;
    width: 25%;
    height: 77%;
    top: 12%;
    left: 3%;
    border-radius: 50%;
}

ol {
    counter-reset: item;
}

li.who_benefits_list::before {
    content: counter(item);
    counter-increment: item;
    color: #ffffff;
    background-color: #191917;
    border-radius: 43%;
    width: 2rem;
    height: 1.5rem;
    display: inline-flex;
    justify-content: center;
    align-items: center;
    font-size: 0.8125rem;
    border: 0.3125rem solid #ffffff;
    position: absolute;
    top: 0rem;
    left: -0.6875rem;
}

li.who_benefits_list {
    margin: 0.625rem 0;
    padding: 0.3125rem 0.625rem 0.3125rem 1.875rem;
    background-color: #cbeffd;
    border-radius: 2em;
    box-shadow: 0 0.125rem 0.25rem rgba(0, 0, 0, 0.1);
    display: flex;
    align-items: center;
    position: relative;
    text-align: -webkit-center;
    width: -webkit-fill-available;
    font-size: 0.9rem;
    border: 0.2em solid #ffffff;
}

.whoBenefitsSidePic {
    position: relative;
    display: inline-block;
    padding-bottom: 30%;
}

.content_section {
    align-content: center;
    display: inline-block;
    font-family: sans-serif;
}

img {
    display: block;
    width: 35em;
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

h4 {
}

h5 {
    color: #b9b9b9;
}

.schoolOwners {
    color: red;
}

p {
    color: #b9b9b9;
    font-size: 1.1rem;
}

h1 {
    font-size: 2.3em;
}

@media only screen and (min-width: 1280px) {
    li.who_benefits_list {
        font-size: 1.1rem;
    }

    h1 {
        font-size: 2.5em;
    }

    p {
        color: #b9b9b9;
        font-size: 1.4rem;
    }
}

@media only screen and (max-width: 540px){
    li.who_benefits_list {
        font-size: 1.2rem;
    }

    h1 {
        font-size: 2.5em;
    }

    p {
        color: #b9b9b9;
        font-size: 1.4rem;
    }
    
    .schoolManaged{
    top: 31%;
    left: 52%;
    }
    
    .schoolManaged2{
    top: 31%;
    left: 4%;
    }
}


@media only screen and (min-width: 546px) and (max-width: 769px) {
    li.who_benefits_list {
        font-size: 0.7rem;
    }

    h1 {
        font-size: 1.3em;
    }

    p {
        color: #b9b9b9;
        font-size: 1rem;
    }

    .schoolManaged {
        top: 55%;
        left: 52%;
    }

    .schoolManaged2 {
        top: 54%;
        left: 4%;
    }
}







""".trimIndent()
