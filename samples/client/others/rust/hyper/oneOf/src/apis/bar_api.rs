/*
 * ByRefOrValue
 *
 * This tests for a oneOf interface representation 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;
use std::pin::Pin;
#[allow(unused_imports)]
use std::option::Option;

use hyper;
use hyper_util::client::legacy::connect::Connect;
use futures::Future;

use crate::models;
use super::{Error, configuration};
use super::request as __internal_request;

pub struct BarApiClient<C: Connect>
    where C: Clone + std::marker::Send + Sync + 'static {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: Connect> BarApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> BarApiClient<C> {
        BarApiClient {
            configuration,
        }
    }
}

pub trait BarApi {
    fn create_bar(&self, bar_create: models::BarCreate) -> Pin<Box<dyn Future<Output = Result<models::Bar, Error>>>>;
}

impl<C: Connect>BarApi for BarApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    #[allow(unused_mut)]
    fn create_bar(&self, bar_create: models::BarCreate) -> Pin<Box<dyn Future<Output = Result<models::Bar, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::POST, "/bar".to_string())
        ;
        req = req.with_body_param(bar_create);

        req.execute(self.configuration.borrow())
    }

}
