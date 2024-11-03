# POST http://localhost:8083/api/comments/
# Request
{
"ticketId": "67272e562d17e03e4e0a6be5", // Reference to the Ticket
"userId": "67271c8076228a729cd80c65", // Reference to the User
"content": "Please prioritize it"
}
# Response
{
"id": "67275bf2f8f0a81433defd64",
"ticketId": "67272e562d17e03e4e0a6be5",
"userId": "67271c8076228a729cd80c65",
"content": "Please prioritize it"
}
# GET http://localhost:8083/api/comments/ticket/{ticketId}
# http://localhost:8083/api/comments/ticket/67272e562d17e03e4e0a6be5
# Request

# Response
[
{
"id": "67275bf2f8f0a81433defd64",
"ticketId": "67272e562d17e03e4e0a6be5",
"userId": "67271c8076228a729cd80c65",
"content": "Please prioritize it"
},
{
"id": "67275c49f8f0a81433defd65",
"ticketId": "67272e562d17e03e4e0a6be5",
"userId": "67271c8076228a729cd80c65",
"content": "Any update please"
}
]